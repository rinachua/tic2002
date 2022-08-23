public class Task {
    protected String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    //TODO: Add your code here
    @Override
    public String toString() {
        return "description: " + description;
    }
}
