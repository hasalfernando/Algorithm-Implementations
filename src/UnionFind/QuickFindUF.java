public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){

        id = new int[N]; //initialize the array for the N number of indexes

        //Iterate through the array to add an id to each index
        for(int i = 0; i<N; i++){
            id[i]=i;
        }
    }

    public boolean connected(int p, int q){

        return (id[p]==id[q]);
    }

    public void union(int p, int q){


        int pId = id[p];
        int qId = id[q];

        for(int i = 0; i<id.length; i++){
            if(id[i]==pId){
                id[i] = qId;
            }
        }
    }

    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(6);
        qf.union(2,3);
        System.out.println("2 and 3 connected is "+qf.connected(2,3));
    }
}
