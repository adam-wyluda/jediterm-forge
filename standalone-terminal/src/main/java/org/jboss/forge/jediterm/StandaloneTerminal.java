package org.jboss.forge.jediterm;

import com.jediterm.terminal.ui.JediTermWidget;
import org.jboss.forge.furnace.Furnace;
import org.jboss.forge.furnace.se.FurnaceFactory;

import javax.swing.*;
import java.awt.*;

/**
 * @author Adam Wyłuda
 */
public class StandaloneTerminal extends JFrame
{
    public static void main(String[] args)
    {
        Furnace furnace = FurnaceFactory.getInstance();

        JediTermWidget widget = ForgeConsoleFactory.create(furnace);
        widget.getComponent();

        new StandaloneTerminal(widget).setVisible(true);
    }

    public StandaloneTerminal(JediTermWidget widget) throws HeadlessException
    {
        setSize(500, 500);
        setTitle("Standalone Forge terminal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(widget.getComponent());
    }
}
