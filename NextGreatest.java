class NextGreatest
{
   
    public static void findNextGreaterElements(int[] input)
    {
        
        if (input == null) {
            return;
        }
 
       
        for (int i = 0; i < input.length; i++)
        {
           
            int next = -1;
 
            
            for (int j = i + 1; j < input.length; j++)
            {
                
                if (input[j] > input[i])
                {
                    next = input[j];
                    break;
                }
            }
 
            System.out.print(next + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] input = { 2, 7, 3, 5, 4, 6, 8 };
        findNextGreaterElements(input);
    }
}
