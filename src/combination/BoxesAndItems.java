package combination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxesAndItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes-");
        int bs = sc.nextInt();
        char boxes[] = new char[bs];
        for(int i=0;i<bs;i++){
            boxes[i] = (char)('a' + i);
        }

        System.out.println("Enter the number of items to be placed-");
        int items = sc.nextInt();
        List<String> res = new ArrayList<>();
        boolean visited[] = new boolean[bs];
        solve(res,boxes,items,visited,new ArrayList<>());
        res.stream().forEach(System.out::println);
    }

    private static void solve(List<String> res,char boxes[], int items,boolean visited[], List<String> temp){
        if(temp.size() == items){
            StringBuilder sb = new StringBuilder();
            temp.stream().forEach(sb::append);
            res.add(sb.toString());
            temp = new ArrayList<>();
            return;
        }

        for(int i=0;i<boxes.length;i++){
            if(!visited[i]){
                temp.add(String.valueOf(boxes[i]));
                visited[i] = true;
                solve(res,boxes,items,visited,temp);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}
