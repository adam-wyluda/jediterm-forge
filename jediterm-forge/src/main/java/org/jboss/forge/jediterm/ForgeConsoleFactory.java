package org.jboss.forge.jediterm;

import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;
import org.jboss.forge.furnace.Furnace;

/**
 * @author Adam Wyłuda
 */
public class ForgeConsoleFactory
{
    public static JediTermWidget create(Furnace furnace)
    {
        JediTermWidget widget = new JediTermWidget(new DefaultSettingsProvider());

        widget.setTtyConnector(new ForgeTtyConnectorAdapter());

        return widget;
    }
}
