package linkedlist;

public class program1 {
	    public class  Node {
	        int data;
	        Node next;
	        Node(int data){
	            this.data=data;
	             next=null;  
	        }
	    } 
	    Node head;
	     void insert(int data){
	        Node newnode= new Node(data);
	        Node temp=head;
	        if(head==null){
	           head=newnode;
	           return;
	        }
	        while(temp.next!=null){
	            temp=temp.next;
	        }
	        temp.next=newnode;
	    }
	    void sorting(){
	        Node curr=head;
	        while(curr!=null) {
	        	Node index=curr.next;
	        	while(index!=null) {
	        		if(index.data<curr.data) {
	        			int  temp=curr.data;
	        			curr.data=index.data;
	        			index.data=temp;
	        		}
	        		index=index.next;
	        		}
	        	curr=curr.next;
	        }
	    }
	     void insertatbigening(int data){
	        Node newnode=new Node(data);
	        if(head==null){
	            head.next=newnode;
	        }else{
	            newnode.next=head;
	            head=newnode;
	        }
	     }
	     void insertatanypoint(int data,int pos){
	        Node newnode=new Node(data);
	        Node current=head;
	        for(int i=1;i<pos-1;i++){
	            current=current.next;
	        }
	        newnode.next=current.next;
	        current.next=newnode;


	     }
	     void deleteatanypoint(int pos){
	         Node temp=head;
	         if(head==null){
	            System.out.println("cannot perform delete operation");
	          } else if(head.next==null){
	            head=null;
	          } 
	          else if (pos==1) {
	            head=head.next;
	              
	          }else{

	            for(int i=0;i<pos-1;i++){
	               temp=temp.next;
	            }
	            temp.next=temp.next.next;
	          }
	        }
	        void deletebegining(){
	            if(head==null){
	                return;

	            }else if(head.next==null){
	                head=null;
	                
	            }else{
	                head=head.next;
	            }
	        }
	         
	         
	     
	     void print(){
	        Node temp=head;
	        while(temp!=null){
	            System.out.println(temp.data);
	            temp=temp.next;
	        }

	    }
	    
	    public static void main(String[] args) {
	       program1 list=new program1();
	       	list.sorting();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insertatbigening(10);
	        list.insertatanypoint(33, 2);
	        list.sorting();
	        list.print();





	    }


	    
	    
	}

