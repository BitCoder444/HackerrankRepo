public static void insertIntoSorted(int[] array) {
    
    int arrLength = array.length;
    
    for (int i = 0; i < arrLength; i++)
    {
        int k = i;
        
        while (k > 0)
        {
            //if left is bigger that the thing to the right
            if (array[i] <= array[k])
            {
                int temp = array[i];
                
                array[i] = array[k];
                array[k] = temp;
                k--;
                continue;
            }
            
            else
            {
                break;
            }

        }
    }
}
