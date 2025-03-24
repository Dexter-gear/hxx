import request from '@/utils/request'

// 查询配送信息列表
export function listDelivery(query) {
  return request({
    url: '/system/delivery/list',
    method: 'get',
    params: query
  })
}

// 查询配送信息详细
export function getDelivery(deliveryId) {
  return request({
    url: '/system/delivery/' + deliveryId,
    method: 'get'
  })
}

// 新增配送信息
export function addDelivery(data) {
  return request({
    url: '/system/delivery',
    method: 'post',
    data: data
  })
}

// 修改配送信息
export function updateDelivery(data) {
  return request({
    url: '/system/delivery',
    method: 'put',
    data: data
  })
}

// 删除配送信息
export function delDelivery(deliveryId) {
  return request({
    url: '/system/delivery/' + deliveryId,
    method: 'delete'
  })
}
