public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] letter=new String[7][4];
        for(int i=0;i<letter.length;i++){
            for(int j=0;j<letter[i].length;j++){
                if(i==0 || i== letter.length-1 || j==0 || j==letter[i].length-1 || i==3){
                    letter[i][j]="* ";
                }else
                    letter[i][j]="  ";
            }
        }

        for(String[] row:letter){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
