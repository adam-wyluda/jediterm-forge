package org.jboss.forge.jediterm;

import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;

import javax.swing.*;
import java.awt.*;

/**
 * @author Adam Wyłuda
 */
public class StandaloneShell extends JFrame
{
    public static void main(String[] args)
    {
        JediTermWidget widget = new JediTermWidget(new DefaultSettingsProvider());
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
