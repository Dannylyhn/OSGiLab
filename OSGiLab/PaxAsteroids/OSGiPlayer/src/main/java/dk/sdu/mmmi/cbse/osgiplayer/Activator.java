/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dk.sdu.mmmi.cbse.osgiplayer;

import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author danny
 */
public class Activator implements BundleActivator{

    @Override
    public void start(BundleContext bc) throws Exception {
        PlayerPlugin pp = new PlayerPlugin();
        PlayerControlSystem pcs = new PlayerControlSystem();
        bc.registerService(IEntityProcessingService.class, pcs, null);
        bc.registerService(IGamePluginService.class, pp, null);
    }

    @Override
    public void stop(BundleContext bc) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
