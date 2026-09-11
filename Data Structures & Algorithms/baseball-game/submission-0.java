class Solution {
    public int calPoints(String[] operations) {
        List<String> cur = new ArrayList<String>();
        // Traverse
        // See a '+', Take the two previous elements, add together, append to cur.
        // See a 'C', pop the last cur element
        // See a 'D', take the last element, double it and add it on

        for (int i = 0; i < operations.length; i++)
        {
            String curChar = operations[i];
            if (curChar.equals("+"))
            {
                int sum = Integer.parseInt(cur.get(cur.size() - 1)) + Integer.parseInt(cur.get(cur.size() - 2));

                cur.add(String.valueOf(sum));
            }
            else if(curChar.equals("C"))
            {
                cur.remove(cur.size() - 1);
            }
            else if(curChar.equals("D"))
            {
                int sum = Integer.parseInt(cur.get(cur.size() - 1)) * 2;

                cur.add(String.valueOf(sum));
            }
            else
            {
                cur.add(curChar);
            } 
        }

        int sum = 0;
        for (String val : cur)
        {
            sum += Integer.parseInt(val);
        }

        return sum;
    }
}