package yorku.eecs.model.item;

import yorku.eecs.model.payment.Subscription;

public class Newsletter {

    private String newsLetterName;
    private String articleTitle;
    private String url;
    public void loadFrame(String url) {
    }

    public Boolean validateSubscription (Subscription subscription) {

        return true;
    }

    public String getUrl() {
        return url;
    }

    public String setUrl(String url) {
        return this.url;
    }

    public String getNewsLetterName() {
        return newsLetterName;
    }

    public String setNewsLetterName(String newsLetterName) {
        return this.newsLetterName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String setArticleTitle(String articleTitle) {
        return this.articleTitle;
    }






}
