package greaterthanequalto;

public class GreaterThanEqualTo {

    public static void main(String[] args) {
        double recommendedWaterInTake = 8 ;
        double daysInChallenge = 30;
        double yourWaterInTake = 235.5;
        double totalRecommendedAmount = recommendedWaterInTake*daysInChallenge;
        boolean isChallengeComplete = yourWaterInTake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);
    }
    
}
