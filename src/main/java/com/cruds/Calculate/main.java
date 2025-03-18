
public static void main(String[] args, Object[] agrs) {

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

      if (agrs[0].equals("Somar")) {
          sum(x,y);
      } else if (agrs[0].equals("Subtrair")) {
          subtrair(x,y);
      } else if (agrs[0].equals("Dividir")) {
          dividir(x,y);
      }else {
          System.out.println("Opcão invalida!!");
      }
}

//funcoes
  static void sum(int x,int y){
      System.out.println(x+y);
  }

  static void subtrair (int x,int y) {
      System.out.println(x-y);
  }

  static void dividir (int x, int y) {
      System.out.println(x/y);
  }

public void main() {
}
