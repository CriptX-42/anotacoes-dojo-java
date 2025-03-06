public class Aula07Arrat03 {
    public static void main(String[] args){
        int[] idades = new int[]{1,2,3,4,5};

//        for (int i = 0; i < idades.length; i++) {
//            System.out.println(idades[i]);
//        }

        for(int idade: idades) {
            System.out.println(idade);
        }
    }
}
