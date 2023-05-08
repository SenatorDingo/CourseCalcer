public class LinkedList{
	
	public static class Node{
		protected String value;
		protected String[] prereqs;
		protected boolean done;
		
		public Node{
			this.value = null;
			this.prereqs = null;
			this.done = false;			
		}
		
		public Node(String value, String[] prereqs, boolean done){
			this.value = value;;
			this.prereqs = prereqs
			this.done = done;
		}
	}
	
	
	