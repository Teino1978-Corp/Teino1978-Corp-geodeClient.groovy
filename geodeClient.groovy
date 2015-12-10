@GrabResolver(name='asf-snapshots', root="https://repository.apache.org/content/repositories/snapshots")
@Grab(group="org.apache.geode", module = "gemfire-core", version = "1.0.0-incubating-SNAPSHOT")

import com.gemstone.gemfire.cache.client.ClientCacheFactory
import com.gemstone.gemfire.cache.client.ClientRegionShortcut

cache = new ClientCacheFactory()
        .addPoolLocator("localhost", 10334)
        .create();

region = cache.createClientRegionFactory(ClientRegionShortcut.CACHING_PROXY).create("myRegion")

region.put("1","Hello")
region.put("2","World")