
public class Main {
    public static void main(String[] args) {
        Trees tree1 = new Trees(10, "Topol");
        Trees tree2 = new Trees(8, "Bereza");
        Trees tree3 = new Trees(5, "Klen");
        Trees tree4 = new Trees(13, "Dub");
        Trees tree5 = new Trees(6, "Yasen");

        Trees [] trees = {tree1, tree2, tree3, tree4, tree5};

        for (int i = 0; i < trees.length; i++){
            trees[i].info();
        }

        Trees [] trees2 = new Trees[5];
        for (int i = 0; i < 5; i++){
            trees2[i] = new Trees("Rostoc" + i);
            trees2[i].info();
        }

        System.out.println("Total number of trees is " + Trees.count);


    }
}
