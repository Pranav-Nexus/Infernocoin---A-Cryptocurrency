package inferno;
import java.util.ArrayList;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import java.io.*;

public class miner implements Hashing{
	public static ArrayList<Block> blockchain1 = new ArrayList<Block>();
	public static ArrayList<Block> blockchain2 = new ArrayList<Block>();
	public static ArrayList<Block> blockchain3 = new ArrayList<Block>();
	public static ArrayList<Block> blockchain4 = new ArrayList<Block>();
	public static int difficulty = 5;
	public static int i1,i2,i3,i4;
	public static boolean status;
	
	
	public  void mineBl(int no) {
		
		
		
		//add our blocks to the blockchain ArrayList:
		for(int i=0;i<no;i++)
		{
			if(i==0)
			{
		System.out.println("Trying to Mine block 1... ");
		addBlock1(new Block("1st block", "0"));
		
		    
		

		
			}
			else
			{
		System.out.println("Trying to Mine block "+(i+1));
		addBlock1(new Block((i+1)+ "th block",blockchain1.get(blockchain1.size()-1).hash));
		

		
			}
			Block currentBlock; 
			Block previousBlock;
			String hashTarget = new String(new char[difficulty]).replace('\0', '0');
			
			//loop through blockchain to check hashes:
			for(int j=1; j < blockchain1.size(); j++) {
				currentBlock = blockchain1.get(j);
				previousBlock = blockchain1.get(j-1);
				//compare registered hash and calculated hash:
				if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
					System.out.println("Current Hashes not equal");			
					status= false;
				}
				//compare previous hash and registered previous hash
				if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
					System.out.println("Previous Hashes not equal");
					status= false;
				}
				//check if hash is solved
				if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
					System.out.println("This block hasn't been mined");
					status= false;
				}
				
			}
			status= true;
		System.out.println("\nBlockchain is Valid: " + status);
		if(status)
		{
			i1++;
		}
		else
		{
			System.out.println("Invalid transaction");
 
		}
		
		
	}
		try{
			   FileWriter fstream = new FileWriter ("E:/USER1/user1.txt",true);
			   BufferedWriter info = new BufferedWriter(fstream);
			   FileWriter fstreamL = new FileWriter ("C:/Users/ragna/Desktop/blocks/Ledger.txt",true);
			   BufferedWriter infoL = new BufferedWriter(fstreamL);
			   for(int i=0;i<blockchain1.size();i++)
			   {
				   info.write(blockchain1.get(i).hash);
				   info.newLine();
				   infoL.write(blockchain1.get(i).hash);
				   infoL.newLine();
			   }info.close();
			   infoL.close();
			   }
		catch(Exception e)
		{
        System.out.println("A write error has occurred");
	}
		

		String blockchainJson = Hashing.getJson(blockchain1);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
	}
	
	
	public static void addBlock1(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain1.add(newBlock);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public  void mineB2(int no) {	
		  //add our blocks to the blockchain ArrayList:
		  for(int i=0;i<no;i++)
		  {
		    if(i==0)
		    {
		  System.out.println("Trying to Mine block 1... ");
		  addBlock2(new Block("1st block", "0"));
		  
		    }
		    else
		    {
		  System.out.println("Trying to Mine block "+(i+1));
		  addBlock2(new Block((i+1)+ "th block",blockchain2.get(blockchain2.size()-1).hash));
		  
		    }
		    Block currentBlock; 
		    Block previousBlock;
		    String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		    
		    //loop through blockchain to check hashes:
		    for(int j=1; j < blockchain2.size(); j++) {
		      currentBlock = blockchain2.get(j);
		      previousBlock = blockchain2.get(j-1);
		      //compare registered hash and calculated hash:
		      if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
		        System.out.println("Current Hashes not equal");			
		        status= false;
		      }
		      //compare previous hash and registered previous hash
		      if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
		        System.out.println("Previous Hashes not equal");
		        status= false;
		      }
		      //check if hash is solved
		      if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
		        System.out.println("This block hasn't been mined");
		        status= false;
		      }
		      
		    }
		    status= true;
		  System.out.println("\nBlockchain is Valid: " + status);
		  if(status)
		  {
		    i2++;
		  }
		  else
		  {
		    System.out.println("Invalid transaction");

		  }
		  }
		  try{
			  FileWriter fstreamL = new FileWriter ("E:/USER2/user2.txt",true);
			   BufferedWriter infoL = new BufferedWriter(fstreamL);
				FileWriter fstream = new FileWriter ("C:/Users/ragna/Desktop/blocks/Ledger.txt",true);
				   BufferedWriter info = new BufferedWriter(fstream);
				   for(int i=0;i<blockchain2.size();i++)
				   {
					   info.write(blockchain2.get(i).hash);
					   info.newLine();
					   infoL.write(blockchain2.get(i).hash);
					   infoL.newLine();
				   }info.close();
				   infoL.close();
		  }

			catch(Exception e)
			{
	        System.out.println("A write error has occurred");
		}
		  
		  
		
		  String blockchainJson = Hashing.getJson(blockchain2);
		  System.out.println("\nThe block chain: ");
		  System.out.println(blockchainJson);
		}


		public static void addBlock2(Block newBlock) {
		  newBlock.mineBlock(difficulty);
		  blockchain2.add(newBlock);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public  void mineB3(int no) {	
			  //add our blocks to the blockchain ArrayList:
			  for(int i=0;i<no;i++)
			  {
			    if(i==0)
			    {
			  System.out.println("Trying to Mine block 1... ");
			  addBlock3(new Block("1st block", "0"));
			  
			    }
			    else
			    {
			  System.out.println("Trying to Mine block "+(i+1));
			  addBlock3(new Block((i+1)+ "th block",blockchain3.get(blockchain3.size()-1).hash));
			  
			    }
			    Block currentBlock; 
			    Block previousBlock;
			    String hashTarget = new String(new char[difficulty]).replace('\0', '0');
			    
			    //loop through blockchain to check hashes:
			    for(int j=1; j < blockchain3.size(); j++) {
			      currentBlock = blockchain3.get(j);
			      previousBlock = blockchain3.get(j-1);
			      //compare registered hash and calculated hash:
			      if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
			        System.out.println("Current Hashes not equal");			
			        status= false;
			      }
			      //compare previous hash and registered previous hash
			      if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
			        System.out.println("Previous Hashes not equal");
			        status= false;
			      }
			      //check if hash is solved
			      if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
			        System.out.println("This block hasn't been mined");
			        status= false;
			      }
			      
			    }
			    status= true;
			  System.out.println("\nBlockchain is Valid: " + status);
			  if(status)
			  {
			    i3++;
			  }
			  else
			  {
			    System.out.println("Invalid transaction");

			  }
			  
			  
			}
			  try{
				  FileWriter fstreamL = new FileWriter ("E:/USER3/user3.txt",true);
				   BufferedWriter infoL = new BufferedWriter(fstreamL);
					FileWriter fstream = new FileWriter ("C:/Users/ragna/Desktop/blocks/Ledger.txt",true);
					   BufferedWriter info = new BufferedWriter(fstream);
					   for(int i=0;i<blockchain3.size();i++)
					   {
						   info.write(blockchain3.get(i).hash);
						   info.newLine();
						   infoL.write(blockchain3.get(i).hash);
						   infoL.newLine();
					   }info.close();
					   infoL.close();

					   }
				catch(Exception e)
				{
		        System.out.println("A write error has occurred");
			}
			  String blockchainJson = Hashing.getJson(blockchain3);
			  System.out.println("\nThe block chain: ");
			  System.out.println(blockchainJson);
			}


			public static void addBlock3(Block newBlock) {
			  newBlock.mineBlock(difficulty);
			  blockchain3.add(newBlock);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public  void mineB4(int no) {	
				  //add our blocks to the blockchain ArrayList:
				  for(int i=0;i<no;i++)
				  {
				    if(i==0)
				    {
				  System.out.println("Trying to Mine block 1... ");
				  addBlock4(new Block("1st block", "0"));
				  
				    }
				    else
				    {
				  System.out.println("Trying to Mine block "+(i+1));
				  addBlock4(new Block((i+1)+ "th block",blockchain4.get(blockchain4.size()-1).hash));
				  
				    }
				    Block currentBlock; 
				    Block previousBlock;
				    String hashTarget = new String(new char[difficulty]).replace('\0', '0');
				    
				    //loop through blockchain to check hashes:
				    for(int j=1; j < blockchain4.size(); j++) {
				      currentBlock = blockchain4.get(j);
				      previousBlock = blockchain4.get(j-1);
				      //compare registered hash and calculated hash:
				      if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				        System.out.println("Current Hashes not equal");			
				        status= false;
				      }
				      //compare previous hash and registered previous hash
				      if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				        System.out.println("Previous Hashes not equal");
				        status= false;
				      }
				      //check if hash is solved
				      if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				        System.out.println("This block hasn't been mined");
				        status= false;
				      }
				      
				    }
				    status= true;
				  System.out.println("\nBlockchain is Valid: " + status);
				  if(status)
				  {
				    i4++;
				  }
				  else
				  {
				    System.out.println("Invalid transaction");

				  }
				  
				  
				}
				  try{
					  FileWriter fstreamL = new FileWriter ("E:/USER4/user4.txt",true);
					   BufferedWriter infoL = new BufferedWriter(fstreamL);
						FileWriter fstream = new FileWriter ("C:/Users/ragna/Desktop/blocks/Ledger.txt",true);
						   BufferedWriter info = new BufferedWriter(fstream);
						   for(int i=0;i<blockchain4.size();i++)
						   {
							   info.write(blockchain4.get(i).hash);
							   info.newLine();
							   infoL.write(blockchain4.get(i).hash);
							   infoL.newLine();
						   }info.close();
						   infoL.close();
						   }
					catch(Exception e)
					{
			        System.out.println("A write error has occurred");
				}
				  String blockchainJson = Hashing.getJson(blockchain4);
				  System.out.println("\nThe block chain: ");
				  System.out.println(blockchainJson);
				}


				public static void addBlock4(Block newBlock) {
				  newBlock.mineBlock(difficulty);
				  blockchain4.add(newBlock);
				}
				
				
				
				
		
				
				
				
				
				
				
				
				
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user id");
		String userid=sc.nextLine();
		System.out.println("Enter the password");
		String pass=sc.nextLine();
		String u1="Pranav",u2="Vageesh",u3="Suryaa",u4="Vishal";
		String p1="ph",p2="sks",p3="se",p4="vks";
		int n;
		if((userid.equals(u1)&&pass.equals(p1)))			
		{
			System.out.println("Welcome "+u1);
			System.out.println("Your wallet balance is "+i1);
			System.out.println("Enter the number of blocks to mine");
			n=sc.nextInt();
			miner ob1=new miner();
			ob1.mineBl(n);
			System.out.println("added "+i1+ " Infernos to your wallet");
			
		}
		else if((userid.equals(u2)&&pass.equals(p2)))			
		{
			System.out.println("Welcome "+u2);
			System.out.println("Your wallet balance is "+i2);
			System.out.println("Enter the number of blocks to mine");
			n=sc.nextInt();
			miner obj2=new miner();
			obj2.mineB2(n);
			System.out.println("added "+i2+ " Infernos to your wallet");			
		}
		else if((userid.equals(u3)&&pass.equals(p3)))			
		{
			System.out.println("Welcome "+u3);
			System.out.println("Your wallet balance is "+i3);
			System.out.println("Enter the number of blocks to mine");
			n=sc.nextInt();
			miner obj3=new miner();
			obj3.mineB3(n);
			System.out.println("added "+i3+ " Infernos to your wallet");		
		}
		else if((userid.equals(u4)&&pass.equals(p4)))			
		{
			System.out.println("Welcome "+u4);
			System.out.println("Your wallet balance is "+i4);
			System.out.println("Enter the number of blocks to mine");
			n=sc.nextInt();
			miner obj4=new miner();
			obj4.mineB4(n);
			System.out.println("added "+i4+ " Infernos to your wallet");			
		}
		
		
		
		else
		{
			System.out.println("Verify your credentials");
		}
		
		
	}
}