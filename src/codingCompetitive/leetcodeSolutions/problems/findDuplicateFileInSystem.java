package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findDuplicateFileInSystem {

    public static List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List <String> > map = new HashMap<>();
        for (String path: paths) {
            String[] split = path.split(" ");
            for (int i = 1; i < split.length; i++) {
                String[] file1 = split[i].split("\\(");
                System.out.println();
                file1[1] = file1[1].replace(")","");
                List<String> list = map.getOrDefault(file1[1], new ArrayList<String>());
                list.add(split[0] + "/" + file1[0]);
                System.out.println(list);
                map.put(file1[1], list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key: map.keySet()) {
            if (map.get(key).size() > 1) result.add(map.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));

    }
}
