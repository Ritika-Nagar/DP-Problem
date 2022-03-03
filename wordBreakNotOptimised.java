// Without recursion hai ..kuch cheeze repeat hori hai 

class wordBreakNotOptimised{

	static boolean DictionaryContains(String word){// word to be searched 

		string [] dict ={"mobile","samsung","sam","sung","man","mango", // this is just an array
                           "icecream","and","go","i","like","ice","cream"};


        for(int i=0;i<dict.length;i++){
       	/*if(dict.contains(i)==1){// can be used only for array list

       	}*/

       	if(dict[i].compareTo(word)==0){
       		return true;// agar nhi h string dictionary me ..then return true 
       	}
       	return false;// agar hai toh false return karvao

       }
	}


	static boolean wordBreak(string str){// str is original string 

		int s=str.length();

		if(s==0){// empty string 
			return true;
		}

		boolean wb[]= new booean[s+1];

		for (int i=1;i<=s;i++){

			if(wb[i]==false && DictionaryContains(str.substring(0,i))){// if statement true deta hai agr dono side wali cheeze same value deti hai...i.e false && false ==true (in case of if statment )
				wb[i]=true;//(false==abi tak check nhi hui h && false== string h dict me)
			}

			if(wb[i]==true){// hai string dict me ...toh ynha partion kar skte hai if partion k aage wali string bhi dict me hai 

				if(i==size){// // If we reached the last prefix..agr tum end tak aag gye ho string ke and you have value 1 that means string is valid  [prefix + suffix] 
			      return true;

			      for (int j=0;j<i;j++){
			      	if(wb[j]==false && DictionaryContains(str.substring(i,j))){
			      		wb[j]=true;
			      }

			      if(j==size && wb[j]==true){
			      	return true;
			      }
		        }
			}

			return false;

		}
	}
}