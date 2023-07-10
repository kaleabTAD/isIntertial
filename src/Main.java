public class Main {
    public static void main(String[] args) {
        int result = isIntertial(new int[]{1});
        System.out.println(result);
        result = isIntertial(new int[]{2});
        System.out.println(result);
        result = isIntertial(new int[]{1, 2, 3, 4});
        System.out.println(result);
        result = isIntertial(new int[]{1, 1, 1, 1, 1, 1, 2});
        System.out.println(result);
        result = isIntertial(new int[]{2, 12, 4, 6, 8, 11});
        System.out.println(result);
        result = isIntertial(new int[]{2, 12, 12, 4, 6, 8, 11});
        System.out.println(result);
        result = isIntertial(new int[]{-2, -4, -6, -8, -11});
        System.out.println(result);
        result = isIntertial(new int[]{2, 3, 5, 7});
        System.out.println(result);
        result = isIntertial(new int[]{2, 4, 6, 8, 10});
        System.out.println(result);

    }

    public static int isIntertial(int []a) {
        boolean containsoddvalue=false;
        int []oddvalue=new int[a.length];
        int []evenvalue=new int[a.length];
        int max=Integer.MIN_VALUE;
        int oddIndex=0;
        int evenIndex=0;
        int Isintertial=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0)
            {
                containsoddvalue=true;
                oddvalue[oddIndex]=a[i];
                oddIndex++;
            }
            else {
                evenvalue[evenIndex]=a[i];
                evenIndex++;


            }
            if (max<a[i]){
                max=a[i];
            }

        }

        if (containsoddvalue){
            if (max%2==0){
                for (int i=0; i<oddIndex;i++){
                    for (int j =0; j<evenIndex;j++){
                        if (evenvalue[j]!=max){
                        if (oddvalue[i]> evenvalue[j]){
                            Isintertial=1;
                        }
                        else
                        {
                            Isintertial=0;
                            break;
                        }
                        }
                        else {
                            Isintertial=1;
                        }
                    }
                    if (Isintertial==0){
                        break;
                    }
                }
            }
        }

return  Isintertial;
    }
}



