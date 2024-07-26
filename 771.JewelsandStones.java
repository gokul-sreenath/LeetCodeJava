class Solution {
  public int numJewelsInStones(String jewels, String stones) {
      int output=0;
      for(int j=0;j<jewels.length();j++)
      {
          for(int i=0;i<stones.length();i++)
          {
              if(stones.charAt(i)==jewels.charAt(j))
              {
                  output++;
              }
          }
      }
      return output;
  }
}