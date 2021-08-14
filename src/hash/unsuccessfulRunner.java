package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class unsuccessfulRunner {
    
    public static void main(String[] args) {      
        
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        
        solution(participant, completion);

    }
            public static String solution(String[] participant, String[] completion) {
                
                Arrays.sort(participant);
                Arrays.sort(completion);
                    
                Map<Integer, String> map = new HashMap<>();

                String answer = null;
                for(int i = 0; i < completion.length; i++) {
                    map.put(i, participant[i]); 
                    if(!(map.get(i).equals(completion[i]))){
                        answer = map.get(i);
                        return answer;
                    } 
                }
                answer = participant[participant.length - 1];
                return answer;
            }
}