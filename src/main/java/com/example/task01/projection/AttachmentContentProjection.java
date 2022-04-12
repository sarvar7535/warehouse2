package com.example.task01.projection;

import com.example.task01.entity.Attachment;
import com.example.task01.entity.AttachmentContent;
import com.example.task01.entity.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "attachmentContentProjection", types = AttachmentContent.class)
public interface AttachmentContentProjection {

    Integer getId();

    @Value("#{target.attachment}")
    Attachment getAttachment();

    @Value("#{target.bytes}")
    Byte[] getBytes();

}
