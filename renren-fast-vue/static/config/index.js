/**
 * 开发环境
 */
; (function () {
  window.SITE_CONFIG = {}

  // api接口请求地址
  // window.SITE_CONFIG['baseUrl'] = 'http://localhost:8080/renren-fast';
  // 这里的baseUrl的端口号 需要与 网关服务的端口号保持一致 , 因为我们是发送请求给网关 , 之后通过网关统一转发请求到相应的服务中去
  window.SITE_CONFIG['baseUrl'] = 'http://localhost:88/api'

  // cdn地址 = 域名 + 版本号
  window.SITE_CONFIG['domain'] = './' // 域名
  window.SITE_CONFIG['version'] = ''   // 版本号(年月日时分)
  window.SITE_CONFIG['cdnUrl'] = window.SITE_CONFIG.domain + window.SITE_CONFIG.version
})()
