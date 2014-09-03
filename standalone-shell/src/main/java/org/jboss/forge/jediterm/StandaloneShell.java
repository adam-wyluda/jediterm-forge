package org.jboss.forge.jediterm;

import com.jediterm.terminal.ui.JediTermWidget;
import org.jboss.forge.furnace.Furnace;
import org.jboss.forge.furnace.se.FurnaceFactory;

import javax.swing.*;
import java.awt.*;

/**
 * @author Adam Wyłuda
 */
public class StandaloneShell extends JFrame
{
    public static void main(String[] args)
    {
        Furnace furnace = FurnaceFactory.getInstance();

        JediTermWidget widget = ForgeConsoleFactory.create(furnace);
        widget.getComponent();

        new StandaloneShell(widget).setVisible(true);
    }

    public StandaloneShell(JediTermWidget widget) throws HeadlessException
    {
        setSize(500, 500);
        setTitle("Standalone Forge shell");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(widget.getComponent());
    }
}
