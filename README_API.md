# API Documentation - Contact Selection Initial Display

## Endpoint
- Method: `POST`
- URL: `/purchase/event_entry/event_info/ajax/ref_select_load`
- Content-Type: `application/json`
- Response: `application/json`

## Purpose
Return initial display data for Contact Selection screen, including:
- Region list (地域M) for checkbox rendering
- Full HTML for the screen (`refSelectHTML`)

## Request Body
`RefLoadFormDto`

| Field | Type | Required | Description |
|---|---|---|---|
| `kindRef` | Integer | No | 0: other screen, 1: bulk add screen (controls title) |

### Sample Request
```http
POST /purchase/event_entry/event_info/ajax/ref_select_load
Content-Type: application/json

{ "kindRef": 1 }
```

## Response Body
`LoadOutDto`

| Field | Type | Description |
|---|---|---|
| `rgonInfoDto` | List<RgonInfoDto> | Region list (checkbox data) |
| `refSelectHTML` | String | Full HTML of Contact Selection screen |
| `resultCode` | String | "0" for success |
| `resultMessage` | String | "OK" |

### RgonInfoDto
| Field | Type | Description |
|---|---|---|
| `rgonCd` | String | Region code |
| `rgonNm` | String | Region name |

### Sample Response (truncated)
```json
{
  "resultCode": "0",
  "resultMessage": "OK",
  "rgonInfoDto": [
    { "rgonCd": "01", "rgonNm": "北海道" },
    { "rgonCd": "02", "rgonNm": "東北" },
    { "rgonCd": "03", "rgonNm": "関東" },
    { "rgonCd": "99", "rgonNm": "海外" }
  ],
  "refSelectHTML": "<!DOCTYPE html>..."
}
```

## Notes
- Title in HTML:
  - `kindRef == 1` → `問合せ先一括選択`
  - else → `問合せ先選択`
- Region checkboxes default to checked except `rgonNm == "海外"`.
- Result table renders headers only on initial display.
