public class LightDimCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.newBrightness = level;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(prevBrightness);
    }
}