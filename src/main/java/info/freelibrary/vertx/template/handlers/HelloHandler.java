
package info.freelibrary.vertx.template.handlers;

import info.freelibrary.util.HTTP;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpHeaders;
import io.vertx.ext.web.RoutingContext;

/**
 * A handler that displays a simple string.
 */
public class HelloHandler implements Handler<RoutingContext> {

    /** The handler's copy of the Vert.x instance. */
    private final Vertx myVertx;

    /**
     * Creates a handler that returns a status response.
     *
     * @param aVertx A Vert.x instance
     */
    public HelloHandler(final Vertx aVertx) {
        myVertx = aVertx;
    }

    @Override
    public void handle(final RoutingContext aContext) {
        aContext.response().setStatusCode(HTTP.OK).putHeader(HttpHeaders.CONTENT_TYPE, "text/plain")
                .end("Hello, World!");
    }

    /**
     * Gets the Vert.x instance associated with this handler.
     *
     * @return The Vert.x instance associated with this handler
     */
    public Vertx getVertx() {
        return myVertx;
    }
}
