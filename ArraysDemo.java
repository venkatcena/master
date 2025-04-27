public class ArraysDemo {
    public static void main(String[] args) {
        int[][] numbs = new int[3][];
        numbs[0] = new int[3];
        numbs[1] = new int[4];
        numbs[2] = new int[6];


        for(int i=0;i<numbs.length;i++){
            for(int j=0;j<numbs[i].length;j++){
              numbs[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<numbs.length;i++){
            for(int j=0;j<numbs[i].length;j++){
                System.out.print(numbs[i][j] + " ");
            }
            System.out.println();
        }


        for(int[] n : numbs){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}