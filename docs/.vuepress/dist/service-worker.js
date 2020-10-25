/**
 * Welcome to your Workbox-powered service worker!
 *
 * You'll need to register this file in your web app and you should
 * disable HTTP caching for this file too.
 * See https://goo.gl/nhQhGp
 *
 * The rest of the code is auto-generated. Please don't update this file
 * directly; instead, make changes to your Workbox build configuration
 * and re-run your build process.
 * See https://goo.gl/2aRDsh
 */

importScripts("https://storage.googleapis.com/workbox-cdn/releases/3.6.3/workbox-sw.js");

/**
 * The workboxSW.precacheAndRoute() method efficiently caches and responds to
 * requests for URLs in the manifest.
 * See https://goo.gl/S9QRab
 */
self.__precacheManifest = [
  {
    "url": "404.html",
    "revision": "9bf838ed3e035a0a2f2bf9fae6d88334"
  },
  {
    "url": "about/index.html",
    "revision": "fbe5c8d23eae1d02f910257f6422dd16"
  },
  {
    "url": "assets/css/0.styles.92d765fa.css",
    "revision": "4061a3e511afb103566088b3e72d951f"
  },
  {
    "url": "assets/img/search.83621669.svg",
    "revision": "83621669651b9a3d4bf64d1a670ad856"
  },
  {
    "url": "assets/js/10.98af97eb.js",
    "revision": "bb2cee3846a1f223fa2ec73dd512ef18"
  },
  {
    "url": "assets/js/11.63d05ddc.js",
    "revision": "65484bde8f60af2b41e8efe64dc00547"
  },
  {
    "url": "assets/js/2.67a5ca42.js",
    "revision": "2916627b3b1b24049645e46ae021953f"
  },
  {
    "url": "assets/js/3.c625618d.js",
    "revision": "6596fd4a47244a6254552b1d49095903"
  },
  {
    "url": "assets/js/4.0e911860.js",
    "revision": "adbda543dd1693b7ca8fa839989289bc"
  },
  {
    "url": "assets/js/5.e5f39d73.js",
    "revision": "2d7d57e4e0d61a4a8633ad35ad5df6ad"
  },
  {
    "url": "assets/js/6.7915fda0.js",
    "revision": "1ea15446bbbf614fe1fcf69cd8daaeac"
  },
  {
    "url": "assets/js/7.47d05278.js",
    "revision": "813570e04304b4e6d9c3da0494d9c8d2"
  },
  {
    "url": "assets/js/8.13d8b1ea.js",
    "revision": "6e1396ef9db4419bfccfa39913077724"
  },
  {
    "url": "assets/js/9.488d53d3.js",
    "revision": "5cae56cde7bcbb817f48b135eda7f601"
  },
  {
    "url": "assets/js/app.05c3ac66.js",
    "revision": "cd37adadee0d88651f8a8334756bba29"
  },
  {
    "url": "index.html",
    "revision": "aa9eb5de90616e91fd4edb120967d85b"
  },
  {
    "url": "TESTPAGE.html",
    "revision": "4996d9e1225f43ba8c07b66486c82e0b"
  },
  {
    "url": "TESTPAGE2.html",
    "revision": "24f4b5297ab5790531eed6e8bcae5999"
  }
].concat(self.__precacheManifest || []);
workbox.precaching.suppressWarnings();
workbox.precaching.precacheAndRoute(self.__precacheManifest, {});
addEventListener('message', event => {
  const replyPort = event.ports[0]
  const message = event.data
  if (replyPort && message && message.type === 'skip-waiting') {
    event.waitUntil(
      self.skipWaiting().then(
        () => replyPort.postMessage({ error: null }),
        error => replyPort.postMessage({ error })
      )
    )
  }
})
