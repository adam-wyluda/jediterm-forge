package org.jboss.forge.jediterm;

import com.jediterm.terminal.Questioner;
import com.jediterm.terminal.TtyConnector;

import java.awt.*;
import java.io.IOException;

/**
 * @author Adam Wyłuda
 */
public class ForgeTtyConnectorAdapter implements TtyConnector
{
    @Override
    public boolean init(Questioner q)
    {
        return false;
    }

    @Override
    public void close()
    {

    }

    @Override
    public void resize(Dimension termSize, Dimension pixelSize)
    {

    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public int read(char[] buf, int offset, int length) throws IOException
    {
        return 0;
    }

    @Override
    public void write(byte[] bytes) throws IOException
    {

    }

    @Override
    public boolean isConnected()
    {
        return false;
    }

    @Override
    public void write(String string) throws IOException
    {

    }

    @Override
    public int waitFor() throws InterruptedException
    {
        return 0;
    }
}
