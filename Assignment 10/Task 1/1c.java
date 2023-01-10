calculateBaseScore(int[] scores, int base)
 double baseScore = 0.00;
 int counter = 0;
 
 //sum up the scores for each category
 while (counter < scores.length) {
   if (base > 0 && scores[counter] > 0) {
     baseScore += scores[counter] / base;
   }
  counter++;
 }
return baseScore;
}
