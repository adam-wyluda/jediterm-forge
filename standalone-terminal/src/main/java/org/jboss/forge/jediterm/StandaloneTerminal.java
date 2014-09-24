package org.jboss.forge.jediterm;

import com.jediterm.terminal.ui.JediTermWidget;
import org.jboss.forge.furnace.Furnace;
import org.jboss.forge.furnace.repositories.AddonRepositoryMode;
import org.jboss.forge.furnace.se.FurnaceFactory;
import org.jboss.forge.furnace.util.OperatingSystemUtils;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author Adam Wyłuda
 */
public class StandaloneTerminal extends JFrame
{
    public static void main(String[] args) throws Exception
    {
        Furnace furnace = FurnaceFactory.getInstance();

        String addonDir = new File(OperatingSystemUtils.getUserForgeDir(), "addons").getAbsolutePath();
        furnace.addRepository(AddonRepositoryMode.MUTABLE, new File(addonDir));
        furnace.startAsync().get();

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
