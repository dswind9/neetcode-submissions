class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();

        for (String value : operations) {
            if (value.equals("+")) {
                score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
            } else if (value.equals("C")) {
                score.remove(score.size() - 1);
            } else if (value.equals("D")) {
                score.add(2 * score.get(score.size() - 1));
            } else {
                score.add(Integer.parseInt(value));
            }
        }

        return score.stream().mapToInt(Integer::intValue).sum();
    }
}