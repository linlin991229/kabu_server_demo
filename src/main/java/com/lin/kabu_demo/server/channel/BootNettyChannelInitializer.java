package com.lin.kabu_demo.server.channel;

import com.lin.kabu_demo.server.adapter.BootNettyChannelInboundHandlerAdapter;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;


/**
 * Copyright(C),2022年-2022,霖霖
 *
 * @author 霖霖
 * @version 1.0
 * @date 2024/3/10 14:40
 * @Description
 */

public class BootNettyChannelInitializer<SocketChannel> extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel ch) throws Exception {

        // ChannelOutboundHandler，依照逆序执行
        ch.pipeline().addLast("encoder", new StringEncoder());

        // 属于ChannelInboundHandler，依照顺序执行
        ch.pipeline().addLast("decoder", new StringDecoder());
        /**
         * 自定义ChannelInboundHandlerAdapter
         */
        ch.pipeline().addLast(new BootNettyChannelInboundHandlerAdapter());

    }

}
