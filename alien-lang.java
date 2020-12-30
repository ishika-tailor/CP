//Alien Language......

class Solution{
	
	public String alienlang(String[] words){

			int[] inDegree=new int[26];
			Map<character ,list <character>> graph= new HashMap();

			//print unique character value
			for(String word: words){
				for(c: word.toCharArray()){ //c is keyvalue, so repeatation will not allow
					graph.put(c,new ArrayList<>());
				}
			}

			for(int i=0;i<words.length-1;i++){
				String start=words[i];
				String end=words[i+1];

				if(start.length()>end.length() && start.startWith(end)){
					return "";
				}
				int len=Math.min(start.length(),end.length());

				for(int j=0;j<len;j++){
					char out=start.charAt(j);
					char in=end.chatAt(j);
					if(out!=in){
						graph.get(out).add(in);
						inDegree[(int)in - 'a']++;
						break;
					}
				}
			}

			StringBuilder sb=new StringBuilder();
			Queue<character> q=new LinkedList<character>();

			for(char c:graph.KeySet()){
				if(inDegree[(int) c-'a']==0){
					q.add(c);
				}
			}

			while(!q.isEmpty()){
				char out=q.pull();
				sb.append(out);
				for(char in: graph.get(out)){
					if(--inDegree[(int) in-'a']==0){
						q.add(in);
					}
				}
			}

			return sb.length()==graph.size() ? sb.toString : "";

	}










}