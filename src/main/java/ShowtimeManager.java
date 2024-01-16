public class ShowtimeManager {

    private String[] movieList = new String[0];
    private int maxQuantity = 5;

    public ShowtimeManager() {
        ;
    }

    public ShowtimeManager(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public void add(String addMovie) {
        String[] tmp = new String[movieList.length + 1];
        for (int i = 0; i < movieList.length; i++) {
            tmp[i] = movieList[i];
        }
        tmp[tmp.length - 1] = addMovie;
        movieList = tmp;

    }

    public String[] findAll() {
        return movieList;
    }

    public String[] findLast() {

        int resultLength;
        if (maxQuantity > movieList.length) {
            resultLength = movieList.length;
        } else {
            resultLength = maxQuantity;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movieList[movieList.length - 1 - i];

        }
        return result;
    }
}
