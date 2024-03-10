package com.lin.kabu_demo.servers.channel;

import com.lin.kabu_demo.servers.adapter.BootNettyChannelInboundHandlerAdapter;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;


/**
 * Copyright(C),2022年-2022,霖霖
 *
 * @author 霖霖
 * @version 1.0
 * @date 2024/3/10 14:40
 * @Description
 */

public class BootNettyChannelInitializer extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel ch) {

//        // ChannelOutboundHandler，依照逆序执行
        ch.pipeline().addLast("encoder", new ByteArrayDecoder());
//
//        // 属于ChannelInboundHandler，依照顺序执行
        ch.pipeline().addLast("decoder", new ByteArrayEncoder());
        //  自定义ChannelInboundHandlerAdapter
        ch.pipeline().addLast(new BootNettyChannelInboundHandlerAdapter());

    }

}
