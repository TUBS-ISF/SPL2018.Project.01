import java.awt.Color;

public aspect Blue {
	before(): execution(public void GuiJ.init()) {
		GuiJ.getInstance().setColorScheme(Color.BLUE);
}
}