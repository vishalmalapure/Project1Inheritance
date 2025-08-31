class InvertedPyramid
{
    public static void main(String[] args) {
        int flag=1;
      for(int i=1;i<=6;i++)
      {
          for(int j=1;j<=11;j++)
          {
              if(j>=i && j<=12-i && flag==1)
              {
                  System.out.print("*");
                  flag=0;
              }
              else
              {
                  System.out.print(" ");
                  flag=1;
              }
          }
          System.out.println("");
      }
    }
}
