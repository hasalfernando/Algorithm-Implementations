public class QuickUnion {

    private int[] id;

    public QuickUnion(int N){

        id = new int[N]; //initialize the array for the N number of indexes

        //Iterate through the array to add an id to each index
        for(int i = 0; i<N; i++){
            id[i]=i;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){

        //check whether both the roots are same, because if the roots are same, all the child nodes are connected
        return (root(p)==root(q));
    }

    public void union(int p, int q){

        //p goes to be a child of q
        int i = root(p);
        int j = root(q);
        id[i] = j;

    }
}
