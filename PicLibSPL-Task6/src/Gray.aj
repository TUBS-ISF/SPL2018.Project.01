import java.awt.Color;

public aspect Gray {
	before(): execution(public void GuiJ.init()) {
		GuiJ.getInstance().setColorScheme(Color.GRAY);
}
}
