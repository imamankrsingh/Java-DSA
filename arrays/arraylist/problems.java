import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problems {

    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            if (pa != pb) {
                parent[pa] = pb;
            }
        }

        void reset(int x) {
            parent[x] = x;
        }
    }

    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        DSU dsu = new DSU(n);

        dsu.union(0, firstPerson);

        int i = 0;

        while (i < meetings.length) {
            int time = meetings[i][2];

            ArrayList<int[]> currentMeetings = new ArrayList<>();

            while (i < meetings.length && meetings[i][2] == time) {
                currentMeetings.add(meetings[i]);
                i++;
            }

            for (int[] meet : currentMeetings) {
                dsu.union(meet[0], meet[1]);
            }

            for (int[] meet : currentMeetings) {
                if (dsu.find(meet[0]) != dsu.find(0)) {
                    dsu.reset(meet[0]);
                    dsu.reset(meet[1]);
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            if (dsu.find(j) == dsu.find(0)) {
                result.add(j);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] meetings = {{1,2,5},{2,3,8},{1,5,10}};
        int firstPerson = 1;

        List<Integer> ans = findAllPeople(n, meetings, firstPerson);
        System.out.println(ans);
    }
}
