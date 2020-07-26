package structPat;

public abstract class Ani<FeedingAPI> {
protected FeedingAPI feedingAPI;
    
    protected Ani(FeedingAPI feedingAPI) {
        this.feedingAPI = feedingAPI;
    }
    public abstract String feed();
}