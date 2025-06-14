package Arrays;

class farthesthouse {

    public static int maxDistance(int[] colors) {
        int maxdist = 0;
        int n = colors.length;
        for (int i = n - 1; i > 0; i--) {
            if (colors[0] != colors[i]) {
                maxdist = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (colors[n - 1] != colors[i]) {
                maxdist = Math.max(maxdist, n - 1 - i);
            }
        }
        return maxdist;
    }

    public static void main(String[] args) {
        int colors[] = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));
    }

}