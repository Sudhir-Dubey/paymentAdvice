package com.cnk.travel.operation.clientpaymentadvice.utility;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;

import java.io.IOException;
import java.time.ZonedDateTime;

public class OperationZonedDateTimeSerializer extends StdSerializer<ZonedDateTime> {

    protected OperationZonedDateTimeSerializer(Class<ZonedDateTime> t) {
        super(t);
    }

    protected OperationZonedDateTimeSerializer(JavaType type) {
        super(type);
    }

    protected OperationZonedDateTimeSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected OperationZonedDateTimeSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider provider) throws IOException {
    }
}
