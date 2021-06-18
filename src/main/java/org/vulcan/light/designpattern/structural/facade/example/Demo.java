package org.vulcan.light.designpattern.structural.facade.example;

import java.io.File;

/**
 * 外观模式示例
 *
 * @author Sam Lu
 * @date 2021/6/18
 * @see javax.faces.context.FacesContext 在底层使用了LifeCycle、 ViewHandler 和 NavigationHandler这几个类， 但绝大多数客户端不知道
 * @see javax.faces.context.ExternalContext 在内部使用了ServletContext、 HttpSession、 HttpServletRequest、 HttpServletResponse
 */
public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }

}
