package org.example;


public class Tasks {
    public double[] randnum()
    {
        double[] arr = new double[10];
        for(int i=0;i< arr.length;i++) {
            arr[i] = Math.random();
        }

        return arr;
    }
    public double minarr(double[] arr)
    {
        double min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public double maxarr(double[] arr)
    {
        double max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public void display(double[] a)
    {
        for(int i=0;i< a.length;i++) {
            System.out.println(a[i]);
        }
    }
    public double avgarr(double[] a)
    {
        double sum=0.0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        double avg= sum/a.length;
        return avg;
    }
    public double[] bubbesort(double[] arr)
    {
        double t;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                   t=arr[i];
                   arr[i]=arr[j];
                   arr[j]=t;
                }
            }
        }
        return arr;
    }
    public void prime(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
//            System.out.println(arr[i]);
            int j,m=0,flag=0;
            m=arr[i]/2;
            if(arr[i]==0||arr[i]==1){

            }
            else{
                for(j=2;j<=m;j++){
                    if(arr[i]%j==0){

                        flag=1;
                        break;
                    }
                }
                if(flag==0)  {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public int[] remove(int a,int[] arr)
    {

        int[] arr2 = new int[arr.length - 1];
        for (int i = 0,j=0; i < arr.length; i++) {

            if (arr[i] == a) {
                continue;
            }
            arr2[j++] = arr[i];
        }
     return arr2;
    }

    public void CountLetters(String s) {
        String s1="";
       for(int i=0;i<s.length();i++)
       {
//           if(!s1.contains(s.charAt(i))) {
               int c = 0;
               for (int j = 0; j < s.length(); j++) {
                   if (s.charAt(i) == s.charAt(j)) {
                       c = c + 1;
                       s1 = s1 + s.charAt(i);
                   }
               }
               System.out.println("the letter " + s.charAt(i) + " repeats " + c +" times");
           //}

       }

    }

    public void iter(int[] arr2) {
        for(int i=0;i<arr2.length;i=i+2)
        {
            System.out.println(arr2[i]);
        }
    }

    public char countunique(String st) {
        for(int i=0;i<st.length();i++)
        {
//           if(!s1.contains(s.charAt(i))) {
            int c = 0;
            for (int j = 0; j < st.length(); j++) {

                if (st.charAt(i) == st.charAt(j)) {
                    c = c + 1;

                }
            }
            if(c==1)
            {
                return st.charAt(i);
            }
           // System.out.println("the letter " + st.charAt(i) + " repeats " + c +" times");
            //}

        }
        return '0';

    }
}
