import java.awt.Color;

public aspect White {
	before(): execution(public void GuiJ.init()) {
		GuiJ.getInstance().setColorScheme(Color.WHITE);
}
}